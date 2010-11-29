package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SsmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SsmMstr
 * @author MyEclipse Persistence Tools
 */

public class SsmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SsmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SsmMstr transientInstance) {
		log.debug("saving SsmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SsmMstr persistentInstance) {
		log.debug("deleting SsmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SsmMstr findById(com.gopawpaw.erp.hibernate.s.SsmMstrId id) {
		log.debug("getting SsmMstr instance with id: " + id);
		try {
			SsmMstr instance = (SsmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SsmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SsmMstr instance) {
		log.debug("finding SsmMstr instance by example");
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
		log.debug("finding SsmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SsmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SsmMstr instances");
		try {
			String queryString = "from SsmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SsmMstr merge(SsmMstr detachedInstance) {
		log.debug("merging SsmMstr instance");
		try {
			SsmMstr result = (SsmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SsmMstr instance) {
		log.debug("attaching dirty SsmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SsmMstr instance) {
		log.debug("attaching clean SsmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SsmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SsmMstrDAO) ctx.getBean("SsmMstrDAO");
	}
}