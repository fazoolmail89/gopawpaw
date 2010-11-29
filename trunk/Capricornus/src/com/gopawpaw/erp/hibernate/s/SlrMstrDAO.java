package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SlrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SlrMstr
 * @author MyEclipse Persistence Tools
 */

public class SlrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SlrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SlrMstr transientInstance) {
		log.debug("saving SlrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SlrMstr persistentInstance) {
		log.debug("deleting SlrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SlrMstr findById(com.gopawpaw.erp.hibernate.s.SlrMstrId id) {
		log.debug("getting SlrMstr instance with id: " + id);
		try {
			SlrMstr instance = (SlrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SlrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SlrMstr instance) {
		log.debug("finding SlrMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding SlrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SlrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SlrMstr instances");
		try {
			String queryString = "from SlrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SlrMstr merge(SlrMstr detachedInstance) {
		log.debug("merging SlrMstr instance");
		try {
			SlrMstr result = (SlrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SlrMstr instance) {
		log.debug("attaching dirty SlrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SlrMstr instance) {
		log.debug("attaching clean SlrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SlrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SlrMstrDAO) ctx.getBean("SlrMstrDAO");
	}
}