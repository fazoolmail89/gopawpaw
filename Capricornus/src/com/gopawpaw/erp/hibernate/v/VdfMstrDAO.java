package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VdfMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VdfMstr
 * @author MyEclipse Persistence Tools
 */

public class VdfMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VdfMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VdfMstr transientInstance) {
		log.debug("saving VdfMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VdfMstr persistentInstance) {
		log.debug("deleting VdfMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VdfMstr findById(com.gopawpaw.erp.hibernate.v.VdfMstrId id) {
		log.debug("getting VdfMstr instance with id: " + id);
		try {
			VdfMstr instance = (VdfMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VdfMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VdfMstr instance) {
		log.debug("finding VdfMstr instance by example");
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
		log.debug("finding VdfMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VdfMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VdfMstr instances");
		try {
			String queryString = "from VdfMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VdfMstr merge(VdfMstr detachedInstance) {
		log.debug("merging VdfMstr instance");
		try {
			VdfMstr result = (VdfMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VdfMstr instance) {
		log.debug("attaching dirty VdfMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VdfMstr instance) {
		log.debug("attaching clean VdfMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VdfMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VdfMstrDAO) ctx.getBean("VdfMstrDAO");
	}
}