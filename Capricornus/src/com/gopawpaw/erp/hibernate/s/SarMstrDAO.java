package com.gopawpaw.erp.hibernate.s;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * SarMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.s.SarMstr
 * @author MyEclipse Persistence Tools
 */

public class SarMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SarMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(SarMstr transientInstance) {
		log.debug("saving SarMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(SarMstr persistentInstance) {
		log.debug("deleting SarMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public SarMstr findById(com.gopawpaw.erp.hibernate.s.SarMstrId id) {
		log.debug("getting SarMstr instance with id: " + id);
		try {
			SarMstr instance = (SarMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.s.SarMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(SarMstr instance) {
		log.debug("finding SarMstr instance by example");
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
		log.debug("finding SarMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from SarMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all SarMstr instances");
		try {
			String queryString = "from SarMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public SarMstr merge(SarMstr detachedInstance) {
		log.debug("merging SarMstr instance");
		try {
			SarMstr result = (SarMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(SarMstr instance) {
		log.debug("attaching dirty SarMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(SarMstr instance) {
		log.debug("attaching clean SarMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SarMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SarMstrDAO) ctx.getBean("SarMstrDAO");
	}
}